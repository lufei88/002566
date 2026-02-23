package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.text.ParsePosition;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f extends j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f480short = {2831, 2851, 2876, 2869, 2845, 2873, 2851, 2872, 2857, 2856, 2847, 2872, 2878, 2861, 2872, 2857, 2859, 2869, 2924, 2839, 2858, 2851, 2878, 2849, 2861, 2872, 2826, 2853, 2857, 2848, 2856, 2929, 2685};
    public final String a;

    public f(String str) {
        this.a = str;
    }

    /* renamed from: ۟ۤ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static short[] m4636() {
        if (C0002.m1242() > 0) {
            return f480short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean a() {
        return false;
    }

    @Override // com.github.catvod.spider.merge.P0.j
    public final boolean b(n nVar, Calendar calendar, String str, ParsePosition parsePosition, int i) {
        int i2 = 0;
        while (true) {
            String strM7286 = C0043.m7286(this);
            if (i2 >= C0004.m1584(strM7286)) {
                C0015.m3487(parsePosition, C0007.m1829(parsePosition) + C0004.m1584(strM7286));
                return true;
            }
            int iM1829 = C0007.m1829(parsePosition) + i2;
            if (iM1829 == C0004.m1584(str)) {
                C0035.m6091(parsePosition, iM1829);
                return false;
            }
            if (C0007.m1823(strM7286, i2) != C0007.m1823(str, iM1829)) {
                C0035.m6091(parsePosition, iM1829);
                return false;
            }
            i2++;
        }
    }

    public final String toString() {
        return C0028.m5188(new StringBuilder(C0044.m7509(m4636(), 0, 32, 2892)), C0043.m7286(this), C0018.m3917(m4636(), 32, 1, 2592));
    }
}