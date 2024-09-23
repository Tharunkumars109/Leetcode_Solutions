class Solution(object):
    def minNumberOfSeconds(self, mountainHeight, workerTimes):
        """
        :type mountainHeight: int
        :type workerTimes: List[int]
        :rtype: int
        """
        # Helper function to check if the workers can finish within max_time
        def canFinishWithinTime(max_time):
            total_height_reduced = 0
            for time in workerTimes:
                # Binary search to find how much height this worker can reduce within max_time
                left, right = 0, mountainHeight
                while left < right:
                    mid = (left + right + 1) // 2
                    # Check if this worker can reduce 'mid' units of height within 'max_time'
                    if time * mid * (mid + 1) // 2 <= max_time:
                        left = mid
                    else:
                        right = mid - 1
                total_height_reduced += left
                if total_height_reduced >= mountainHeight:
                    return True
            return total_height_reduced >= mountainHeight

        # Binary search for the minimum time
        left, right = 1, max(workerTimes) * mountainHeight * (mountainHeight + 1) // 2
        while left < right:
            mid = (left + right) // 2
            if canFinishWithinTime(mid):
                right = mid
            else:
                left = mid + 1
        
        return left

