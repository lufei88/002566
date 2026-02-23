package com.github.catvod.spider;

import android.content.SharedPreferences;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.j;

/* loaded from: classes.dex */
public final /* synthetic */ class XBPQc implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f124short = {28520, 29341, -24764, -32315, -27960, -31867};
    public final /* synthetic */ XBPQ c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ XBPQc(XBPQ xbpq, String str, String str2) {
        this.c = xbpq;
        this.d = str;
        this.e = str2;
    }

    /* renamed from: ۨ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m743() {
        if (C0004.m1557() <= 0) {
            return f124short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final XBPQ xbpqM9743 = C0065.m9743(this);
        String strM4415 = C0022.m4415(this);
        final String strM9304 = C0060.m9304(this);
        C0047.m7785();
        C0047.m7777(xbpqM9743);
        C0027.m5038(C0052.m8337(m743(), 0, 6, 2116), strM4415, strM9304, new j() { // from class: com.github.catvod.spider.XBPQ.4

            /* renamed from: short */
            private static final short[] f119short = {2042, 2042, 2042, 3097, 623, 535, 623, 535, 623, 535, 1952, 2308, 2350, 2362, 744, 3241, 2630, 1992, 2011, 2015, 1994, 1998};
            final /* synthetic */ String a;

            AnonymousClass4(final String strM93042) {
                str = strM93042;
            }

            /* renamed from: ۟۟ۢۦ */
            public static String m726(Object obj, Object obj2) {
                if (C0020.m4210() > 0) {
                    return null;
                }
                return ((XBPQ) obj).A = (String) obj2;
            }

            /* renamed from: ۟۠ۤۢۧ */
            public static String m727(Object obj) {
                if (C0061.m9359() <= 0) {
                    return XBPQ.m713((XBPQ) obj);
                }
                return null;
            }

            /* renamed from: ۟ۢۦۧۢ */
            public static String m728(Object obj, Object obj2) {
                if (C0053.m8389() < 0) {
                    return null;
                }
                return ((XBPQ) obj).z = (String) obj2;
            }

            /* renamed from: ۟ۥۨۨۡ */
            public static String m729(Object obj) {
                if (C0012.m3024() > 0) {
                    return XBPQ.m657((XBPQ) obj);
                }
                return null;
            }

            /* renamed from: ۠۠ۤۦ */
            public static String m730(Object obj) {
                if (C0025.m4797() >= 0) {
                    return str;
                }
                return null;
            }

            /* renamed from: ۣۡۧ۟ */
            public static SharedPreferences m731() {
                if (C0031.m5628() >= 0) {
                    return Init.d;
                }
                return null;
            }

            /* renamed from: ۥۦۤۡ */
            public static XBPQ m732(Object obj) {
                if (C0019.m4065() < 0) {
                    return XBPQ.this;
                }
                return null;
            }

            /* renamed from: ۨ۟ۧۨ */
            public static short[] m733() {
                if (C0058.m9131() <= 0) {
                    return f119short;
                }
                return null;
            }

            @Override // com.github.catvod.spider.p000mergexbpq.j.j
            public void vertifyCode(String str) {
                int iM9178 = C0059.m9178(str, C0018.m3917(m733(), 0, 3, 2014));
                String strM3646 = C0017.m3646(m733(), 3, 1, 3113);
                if (iM9178 <= 1) {
                    m726(m732(this), strM3646);
                    return;
                }
                String[] strArrM4752 = C0024.m4752(str, C0036.m6188(m733(), 4, 6, 563));
                m726(m732(this), strArrM4752.length > 1 ? strArrM4752[1] : C0033.m5852(m733(), 10, 1, 1937));
                SharedPreferences.Editor editorM8069 = C0050.m8069(m731());
                String strM6629 = C0040.m6629(new StringBuilder(), m729(m732(this)), C0045.m7657(m733(), 11, 3, 2395));
                String str2 = strArrM4752[0];
                String strM1549 = C0004.m1549(m733(), 14, 1, 715);
                C0043.m7324(editorM8069, strM6629, C0024.m4752(str2, strM1549)[0]);
                XBPQ.K = C0024.m4752(strArrM4752[0], strM1549)[0];
                m728(m732(this), C0024.m4752(strArrM4752[0], strM1549)[1]);
                if (C0004.m1584(m730(this)) > 2) {
                    String strM730 = m730(this);
                    String strM5565 = C0031.m5565(m733(), 15, 1, 3218);
                    for (String strM7763 : C0024.m4752(strM730, strM5565)) {
                        String strM727 = m727(m732(this));
                        String strM2973 = C0012.m2973(m733(), 16, 1, 2683);
                        if (C0059.m9178(strM727, C0024.m4752(strM7763, strM2973)[0]) < 0) {
                            XBPQ xbpqM732 = m732(this);
                            if (C0004.m1584(m727(xbpqM732)) >= 1 && !C0007.m1815(strM3646, m727(m732(this)))) {
                                StringBuilder sb = new StringBuilder();
                                C0018.m3933(sb, m727(m732(this)));
                                C0018.m3933(sb, strM5565);
                                C0018.m3933(sb, strM7763);
                                strM7763 = C0047.m7763(sb);
                            }
                            m728(xbpqM732, strM7763);
                        } else {
                            XBPQ xbpqM7322 = m732(this);
                            String strM66292 = C0040.m6629(new StringBuilder(), m727(m732(this)), strM5565);
                            String strM66293 = C0040.m6629(new StringBuilder(), C0024.m4752(strM7763, strM2973)[0], C0044.m7509(m733(), 17, 5, 2037));
                            StringBuilder sb2 = new StringBuilder();
                            C0018.m3933(sb2, strM7763);
                            C0018.m3933(sb2, strM5565);
                            m728(xbpqM7322, C0025.m4800(strM66292, strM66293, C0047.m7763(sb2)));
                            XBPQ xbpqM7323 = m732(this);
                            m728(xbpqM7323, C0054.m8636(m727(xbpqM7323), 0, C0004.m1584(m727(m732(this))) - 1));
                        }
                    }
                }
                C0043.m7324(editorM8069, m729(m732(this)), m727(m732(this)));
                C0049.m7994(editorM8069);
            }
        });
    }
}