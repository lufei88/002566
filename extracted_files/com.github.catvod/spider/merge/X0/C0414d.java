package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* renamed from: com.github.catvod.spider.merge.x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0414d extends AbstractC0412b implements InterfaceC0411a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f871short = {495, 495};
    public static final C0414d d = new C0414d(1, 0);

    public C0414d(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: ۟ۧۦۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9489() {
        if (C0013.m3167() > 0) {
            return f871short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0414d) {
            int iM1470 = C0003.m1470(this);
            int iM6134 = C0035.m6134(this);
            if (iM1470 > iM6134) {
                C0414d c0414d = (C0414d) obj;
                if (C0003.m1470(c0414d) <= C0035.m6134(c0414d)) {
                }
                return true;
            }
            C0414d c0414d2 = (C0414d) obj;
            if (iM1470 == C0003.m1470(c0414d2) && iM6134 == C0035.m6134(c0414d2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.x0.InterfaceC0411a
    public final Comparable getEndInclusive() {
        return C0011.m2808(C0035.m6134(this));
    }

    @Override // com.github.catvod.spider.merge.x0.InterfaceC0411a
    public final Comparable getStart() {
        return C0011.m2808(C0003.m1470(this));
    }

    public final int hashCode() {
        int iM1470 = C0003.m1470(this);
        int iM6134 = C0035.m6134(this);
        if (iM1470 > iM6134) {
            return -1;
        }
        return (iM1470 * 31) + iM6134;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0003.m1470(this));
        C0018.m3933(sb, C0065.m9775(m9489(), 0, 2, 449));
        C0036.m6177(sb, C0035.m6134(this));
        return C0047.m7763(sb);
    }
}