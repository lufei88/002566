package com.github.catvod.spider.merge.B;

import com.github.catvod.spider.merge.b0.C0045;

/* loaded from: classes.dex */
public enum g {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;


    /* renamed from: short, reason: not valid java name */
    private static final short[] f374short = {3120, 3121, 3104, 3132, 3117, 3130, 3134, 3115, 3130, 611, 610, 627, 639, 632, 621, 638, 632, 2373, 2372, 2389, 2392, 2383, 2393, 2399, 2375, 2383, 3014, 3015, 3030, 3033, 3016, 3036, 3034, 3020, 3043, 3042, 3059, 3071, 3064, 3043, 3068, 2400, 2401, 2416, 2411, 2410, 2428, 2427, 2429, 2400, 2422, 1477, 1476, 1493, 1483, 1476, 1491, 1832, 1888, 1897, 1915, 1832, 1894, 1895, 1832, 1916, 1897, 1914, 1903, 1901, 1916, 1832, 1915, 1916, 1897, 1916, 1901};

    public final h a() {
        switch (f.b[ordinal()]) {
            case 1:
            case 2:
                return h.c;
            case 3:
            case 4:
                return h.d;
            case 5:
                return h.e;
            case 6:
                return h.a;
            default:
                throw new IllegalArgumentException(this + C0045.m7657(f374short, 57, 20, 1800));
        }
    }
}