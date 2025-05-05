class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] path = new int[rows * cols][2];//just accurate space for requirement
        pathMaker(rStart, cStart, rows - 1, cols - 1, 1, path, 0);
        return path;
    }

    public void pathMaker(int rp, int cp, int re, int ce, int step, int[][] path, int track) {
        if (track >= path.length) {
            return;
        }

        // right la po
        for (int i = 0; i < step; i++) {
            if (isValid(rp, cp, re, ce)) {
                path[track][0] = rp;
                path[track][1] = cp;
                track++;
            }
            cp++;
        }

        // down po
        for (int i = 0; i < step; i++) {
            if (isValid(rp, cp, re, ce)) {
                path[track][0] = rp;
                path[track][1] = cp;
                track++;
            }
            rp++;
        }

        step++; // increment step after right and down (adavadhu after every 2 step)

        // left go
        for (int i = 0; i < step; i++) {
            if (isValid(rp, cp, re, ce)) {
                path[track][0] = rp;
                path[track][1] = cp;
                track++;
            }
            cp--;
        }

        // up po
        for (int i = 0; i < step; i++) {
            if (isValid(rp, cp, re, ce)) {
                path[track][0] = rp;
                path[track][1] = cp;
                track++;
            }
            rp--;
        }

        // recursive call with increased step so tat next time the function enter it wil hav +1step as it already moved 2 stesps
        pathMaker(rp, cp, re, ce, step + 1, path, track);
    }

    public boolean isValid(int row, int col, int re, int ce) {
        return row >= 0 && row <= re && col >= 0 && col <= ce;
    }
}