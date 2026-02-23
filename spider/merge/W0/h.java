package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f868short = {1334, 1330, 1321, 1329, 1332, 1331, 1395, 1335, 1323, 1328, 1395, 1339, 1320, 1331, 1342, 1321, 1332, 1330, 1331, 1326, 1395, 2943, 2920, 2915, 2921, 2920, 2943, 2881, 2924, 2912, 2927, 2921, 2924, 2905, 2914, 2910, 2937, 2943, 2916, 2915, 2922, 2853, 2851, 2851, 2851, 2852};
    private final int arity;

    public h(int i) {
        this.arity = i;
    }

    /* renamed from: ۟۠ۥۡۨ, reason: not valid java name and contains not printable characters */
    public static int m9480(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((h) obj).arity;
        }
        return 0;
    }

    /* renamed from: ۥۤۨۥ, reason: contains not printable characters */
    public static short[] m9481() {
        if (C0029.m5282() > 0) {
            return f868short;
        }
        return null;
    }

    public int getArity() {
        return m9480(this);
    }

    public String toString() {
        C0047.m7777(C0041.m6755());
        String strM6312 = C0037.m6312(C0019.m4102(C0047.m7777(this))[0]);
        if (C0043.m7277(strM6312, C0009.m2037(m9481(), 0, 21, 1373))) {
            strM6312 = C0056.m8890(strM6312, 21);
        }
        C0055.m8753(strM6312, C0043.m7290(m9481(), 21, 25, 2829));
        return strM6312;
    }
}