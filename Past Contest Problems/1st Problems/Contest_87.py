class Solution:
    def countDaysTogether(self, aA: str, lA: str, aB: str, lB: str) -> int:
        months = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        mp = {}
        alice = []
        bob = []
        stop = False
        ms = int(aA[3:])
        for m in range(int(aA[:2]), int(lA[:2]) + 1):
            if stop:
                break
            me = months[m]  
            for d in range(ms, me + 1):
                alice.append([m, d])
                if m == int(lA[:2]) and d == int(lA[3:]):
                    stop = True
                    break 
            ms = 1
        stop = False
        ms = int(aB[3:])
        for m in range(int(aB[:2]), int(lB[:2]) + 1):
            if stop:
                break
            me = months[m]
            for d in range(ms, me + 1):
                bob.append([m, d])
                if m == int(lB[:2]) and d == int(lB[3:]):
                    stop = True
                    break 
            ms = 1
        ans = 0
        print (alice, bob)
        for i in alice:
            if i in bob:
                ans += 1
        return ans