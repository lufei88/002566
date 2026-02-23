package com.github.catvod.spider.p000mergexbpq.c;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f176short = {3022, 3020, 3020, 2204, 2204, 2190, 2381, 2399, 2399, 2536, 2553, 2553, 2533, 2528, 2538, 2536, 2557, 2528, 2534, 2535, 2470, 2545, 2468, 2554, 2556, 2539, 2555, 2528, 2553, 424, 441, 420, 424, 499, 426, 424, 424, 2488, 2473, 2484, 2488, 2531, 2484, 2529, 2495, 2495, 2477};

    @SerializedName("url")
    private String a;

    @SerializedName("name")
    private String b;

    @SerializedName("lang")
    private String c;

    @SerializedName("format")
    private String d;

    /* renamed from: ۢۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2033() {
        if (C0041.m6823() <= 0) {
            return f176short;
        }
        return null;
    }

    public final e a(String str) {
        C0047.m7777(str);
        char c = 65535;
        switch (C0054.m8590(str)) {
            case 96897:
                if (C0007.m1815(str, C0001.m1189(m2033(), 6, 3, 2348))) {
                    c = 0;
                    break;
                }
                break;
            case 114177:
                if (C0007.m1815(str, C0021.m4340(m2033(), 3, 3, 2287))) {
                    c = 1;
                    break;
                }
                break;
            case 117110:
                if (C0007.m1815(str, C0063.m9585(m2033(), 0, 3, 3000))) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.d = C0063.m9585(m2033(), 37, 10, 2508);
                break;
            case 2:
                this.d = C0027.m5062(m2033(), 29, 8, 476);
                break;
            default:
                this.d = C0024.m4740(m2033(), 9, 20, 2441);
                break;
        }
        return this;
    }

    public final e b(String str) {
        this.c = str;
        return this;
    }

    public final e c(String str) {
        this.b = str;
        return this;
    }

    public final e d(String str) {
        this.a = str;
        return this;
    }
}