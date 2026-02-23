package com.github.catvod.spider.merge.T0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class k implements com.github.catvod.spider.merge.V0.o {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f507short = {1731, 1747, 23850, 20532, 568, 538, 525, 528, 527, 528, 525, 512, 19523, 30723, 27038, -30623, 22361, 20381, 31709, 21905, 21338, 26818, 23009, 21954, 22748, -27932, -25101, 2756, 2776, 23506, 30641, -2677, 26120, 28477, -32673, 20542, 23739, 20901, 937, 907, 924, 897, 926, 897, 924, 913, 3004, 3005, 2991, 3012, 3025, 834, 851, 846, 834, 793, 862, 834, 859, 858, 781, 853, 862, 855, 836, 837, 851, 834, 779, 835, 834, 848, 795, 782, 2244, 2244, 31580, 20652, -1987, -916, 809, 804, -902, 2460, 2461, 2445, 2459, 2454, -2825, 28284, 27863, -2847, 2202, 2244, 2260, 2200};
    public final StringBuilder a;

    public k() {
        this.a = new StringBuilder();
    }

    public k(StringBuilder sb) {
        this.a = sb;
    }

    /* renamed from: ۣ۟۟۠, reason: not valid java name and contains not printable characters */
    public static void m5322(Object obj) {
        if (C0048.m7971() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۣۣ۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5323() {
        if (C0005.m1599() < 0) {
            return f507short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void a(r rVar, int i) {
        boolean z = rVar instanceof t;
        StringBuilder sbM1636 = C0005.m1636(this);
        if (z) {
            t tVar = (t) rVar;
            String strM5729 = C0032.m5729(tVar);
            if (C0003.m1357(C0044.m7395(tVar)) || (tVar instanceof d)) {
                C0018.m3933(sbM1636, strM5729);
                return;
            } else {
                C0020.m4248(sbM1636, strM5729, C0031.m5646(sbM1636));
                return;
            }
        }
        if (rVar instanceof m) {
            m mVar = (m) rVar;
            if (C0006.m1693(sbM1636) > 0) {
                E eM6507 = C0039.m6507(mVar);
                if ((C0058.m9163(eM6507) || C0007.m1815(C0025.m4804(eM6507), C0001.m1189(m5323(), 0, 2, 1697))) && !C0031.m5646(sbM1636)) {
                    C0062.m9399(sbM1636, ' ');
                }
            }
        }
    }

    @Override // com.github.catvod.spider.merge.V0.o
    public void b(r rVar, int i) {
        if ((rVar instanceof m) && C0058.m9163(C0039.m6507((m) rVar)) && (C0013.m3117(rVar) instanceof t)) {
            StringBuilder sbM1636 = C0005.m1636(this);
            if (C0031.m5646(sbM1636)) {
                return;
            }
            C0062.m9399(sbM1636, ' ');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object[] c() {
        /*
            r56 = this;
            r5 = r56
            r0 = 0
            android.app.Activity r1 = com.github.catvod.spider.merge.K0.C0022.m4453()
            if (r1 != 0) goto L24
            java.io.PrintStream r1 = com.github.catvod.spider.merge.Y.C0035.m6087()
            short[] r11 = m5323()
            r14 = 633(0x279, float:8.87E-43)
            r12 = 2
            r13 = 12
            java.lang.String r11 = com.github.catvod.spider.merge.Y.C0036.m6188(r11, r12, r13, r14)
            r2 = r11
        L20:
            com.github.catvod.spider.p000mergexbpq.i.C0012.m2969(r1, r2)
            goto L62
        L24:
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = com.github.catvod.spider.p000mergexbpq.e0.C0011.m2778(r1, r2)
            if (r1 != 0) goto L45
            java.io.PrintStream r1 = com.github.catvod.spider.merge.Y.C0035.m6087()
            short[] r35 = m5323()
            r38 = 423(0x1a7, float:5.93E-43)
            r36 = 14
            r37 = 5
            java.lang.String r35 = com.github.catvod.spider.merge.Y.C0035.m6131(r35, r36, r37, r38)
            r2 = r35
            goto L20
        L45:
            java.io.PrintStream r2 = com.github.catvod.spider.merge.Y.C0035.m6087()
            short[] r40 = m5323()
            r43 = 2705(0xa91, float:3.79E-42)
            r41 = 19
            r42 = 13
            java.lang.String r40 = com.github.catvod.spider.merge.C.C0017.m3646(r40, r41, r42, r43)
            r3 = r40
            com.github.catvod.spider.p000mergexbpq.i.C0012.m2969(r2, r3)
            com.github.catvod.spider.merge.p.C0057.m8994(r5, r1, r0)
        L62:
            android.app.Activity r1 = com.github.catvod.spider.merge.K0.C0022.m4453()
            if (r1 != 0) goto L7f
            short[] r23 = m5323()
            r26 = 1000(0x3e8, float:1.401E-42)
            r24 = 32
            r25 = 14
            java.lang.String r23 = com.github.catvod.spider.p000mergexbpq.j.C0013.m3106(r23, r24, r25, r26)
            r1 = r23
            m5322(r1)
            goto L9a
        L7f:
            android.os.Looper r2 = com.github.catvod.spider.p000mergexbpq.R.C0003.m1438(r1)
            java.lang.Thread r2 = com.github.catvod.spider.merge.J0.C0021.m4332(r2)
            java.lang.Thread r3 = com.github.catvod.spider.merge.V.C0031.m5631()
            if (r2 == r3) goto L97
            com.github.catvod.spider.merge.D.g r2 = new com.github.catvod.spider.merge.D.g
            r3 = 4
            r2.<init>(r3)
            com.github.catvod.spider.merge.Z.C0037.m6386(r1, r2)
            goto L9a
        L97:
            com.github.catvod.spider.merge.T0.C0030.m5430()
        L9a:
            java.lang.StringBuilder r1 = com.github.catvod.spider.p000mergexbpq.S.C0005.m1636(r5)
            java.lang.String r1 = com.github.catvod.spider.merge.d.C0047.m7763(r1)
            r2 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r2 = com.github.catvod.spider.p000mergexbpq.e0.C0011.m2808(r2)
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
            short[] r22 = m5323()
            r25 = 3049(0xbe9, float:4.273E-42)
            r23 = 46
            r24 = 5
            java.lang.String r22 = com.github.catvod.spider.merge.T0.C0030.m5362(r22, r23, r24, r25)
            r4 = r22
            byte[] r1 = com.github.catvod.spider.merge.J0.C0021.m4347(r1, r4)
            r3.<init>(r1)
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r2
            short[] r30 = m5323()
            r33 = 822(0x336, float:1.152E-42)
            r31 = 51
            r32 = 23
            java.lang.String r30 = com.github.catvod.spider.merge.q.C0058.m9106(r30, r31, r32, r33)
            r0 = r30
            r2 = 1
            r1[r2] = r0
            r0 = 2
            r1[r0] = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.T0.k.c():java.lang.Object[]");
    }

    public void d(View view, int i) {
        if (view == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            C0018.m3933(sb, C0043.m7290(m5323(), 74, 2, 2281));
        }
        StringBuilder sbM3016 = C0012.m3016(C0047.m7763(sb), C0049.m8007(m5323(), 76, 3, 1831));
        C0018.m3933(sbM3016, C0008.m2013(C0047.m7777(view)));
        StringBuilder sbM30162 = C0012.m3016(C0047.m7763(sbM3016), C0035.m6131(m5323(), 79, 4, 864));
        C0018.m3933(sbM30162, C0010.m2375(view) != -1 ? C0001.m1225(C0034.m6008(view), C0010.m2375(view)) : C0064.m9599(m5323(), 83, 5, 2514));
        String strM7763 = C0047.m7763(sbM30162);
        if (view instanceof TextView) {
            StringBuilder sbM30163 = C0012.m3016(strM7763, C0026.m4951(m5323(), 88, 4, 3067));
            C0016.m3605(sbM30163, C0023.m4571((TextView) view));
            strM7763 = C0047.m7763(sbM30163);
        }
        StringBuilder sbM1636 = C0005.m1636(this);
        C0018.m3933(sbM1636, strM7763);
        C0018.m3933(sbM1636, C0036.m6188(m5323(), 92, 4, 2214));
        C0012.m2969(C0035.m6087(), strM7763);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < C0026.m4897(viewGroup); i3++) {
                C0057.m8994(this, C0051.m8237(viewGroup, i3), i + 1);
            }
        }
    }
}