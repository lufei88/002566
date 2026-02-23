package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f474short = {3227, 3309, 3322, 3327, 3309, 3322, 3244, 3308, 3202, 3208, 3217, 3308, 3322, 3309, 3230, 3310, 3304, 3224, 3308, 3322, 3309, 3225, 3233, 3225, 3233, 3322, 3308, 3322, 3309, 3327, 3322, 3309, 3225, 3233, 3225, 3233, 3322, 3308, 3308, 3322, 3297, 3288, 581, 580, 595};
    public static final Pattern a = C0005.m1602(C0021.m4340(m4630(), 0, 41, 3269));
    public static final E b = new E(0, 0, false);

    public static E a(String str) {
        boolean zM1815 = C0007.m1815(C0060.m9352(m4630(), 41, 1, 3202), str);
        E eM6072 = C0035.m6072();
        if (zM1815 || C0007.m1815(C0062.m9389(m4630(), 42, 3, 528), str)) {
            return eM6072;
        }
        Matcher matcherM6026 = C0034.m6026(C0025.m4798(), str);
        if (!C0015.m3411(matcherM6026)) {
            return null;
        }
        String strM4306 = C0021.m4306(matcherM6026, 2);
        boolean z = false;
        int iM6456 = strM4306 != null ? C0038.m6456(strM4306) : 0;
        String strM43062 = C0021.m4306(matcherM6026, 4);
        int iM64562 = strM43062 != null ? C0038.m6456(strM43062) : 0;
        if (iM6456 == 0 && iM64562 == 0) {
            return eM6072;
        }
        String strM43063 = C0021.m4306(matcherM6026, 1);
        if (strM43063 != null && C0007.m1823(strM43063, 0) == '-') {
            z = true;
        }
        return new E(iM6456, iM64562, z);
    }

    /* renamed from: ۟ۧۦ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m4630() {
        if (C0047.m7837() > 0) {
            return f474short;
        }
        return null;
    }
}