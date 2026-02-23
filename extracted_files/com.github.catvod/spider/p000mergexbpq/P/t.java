package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
public final class t extends z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f146short = {1917, 1877, 3101, 3119, 3186, 3164, 2857, 2943, 2852, 2859, 2857, 2943, 2859, 2853};
    private final int h;

    public t(s sVar, InterfaceC0066d interfaceC0066d, int i) {
        super(sVar, interfaceC0066d, null);
        this.h = i;
    }

    /* renamed from: ۣ۟ۡ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m828() {
        if (C0005.m1599() < 0) {
            return f146short;
        }
        return null;
    }

    /* renamed from: ۣۧۤ۟, reason: not valid java name and contains not printable characters */
    public static int m829(Object obj) {
        if (C0006.m1726() < 0) {
            return ((t) obj).h;
        }
        return 0;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String strM1840;
        String strM2973;
        int iM829 = m829(this);
        if (iM829 < 0 || iM829 >= C0058.m9148((InterfaceC0066d) C0037.m6366(this))) {
            strM1840 = C0007.m1840();
        } else {
            InterfaceC0066d interfaceC0066d = (InterfaceC0066d) C0037.m6366(this);
            int iM8292 = m829(this);
            String strM4045 = C0019.m4045(interfaceC0066d, C0032.m5752(iM8292, iM8292));
            StringBuilder sb = new StringBuilder();
            for (char c : C0019.m4078(strM4045)) {
                if (c == '\t') {
                    strM2973 = C0003.m1398(m828(), 0, 2, 1825);
                } else if (c == '\n') {
                    strM2973 = C0063.m9585(m828(), 2, 2, 3137);
                } else if (c == '\r') {
                    strM2973 = C0012.m2973(m828(), 4, 2, 3118);
                } else {
                    C0062.m9399(sb, c);
                }
                C0018.m3933(sb, strM2973);
            }
            strM1840 = C0047.m7763(sb);
        }
        return C0029.m5240(C0045.m7549(), C0036.m6188(m828(), 6, 8, 2828), new Object[]{C0008.m2013(t.class), strM1840});
    }
}