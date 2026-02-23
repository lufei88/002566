package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0005;

/* loaded from: classes.dex */
public final class U extends l0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f421short = {1529, 1811, 1818, 1818, 1811};
    public final int b;
    public final int c;

    public U(AbstractC0152i abstractC0152i, int i, int i2) {
        super(abstractC0152i);
        this.b = i;
        this.c = i2;
    }

    /* renamed from: ۣ۟۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m3858() {
        if (C0043.m7332() > 0) {
            return f421short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final int a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final com.github.catvod.spider.merge.H0.f c() {
        com.github.catvod.spider.merge.H0.f fVar = new com.github.catvod.spider.merge.H0.f(new int[0]);
        C0018.m3984(fVar, C0064.m9661(this), C0054.m8600(this));
        return fVar;
    }

    @Override // com.github.catvod.spider.merge.F0.l0
    public final boolean d(int i, int i2) {
        return i >= C0064.m9661(this) && i <= C0054.m8600(this);
    }

    public final String toString() {
        String strM1189 = C0001.m1189(m3858(), 0, 1, 1502);
        StringBuilder sbM6149 = C0035.m6149(new StringBuilder(strM1189), C0064.m9661(this));
        C0018.m3933(sbM6149, C0005.m1645(m3858(), 1, 4, 1844));
        StringBuilder sbM61492 = C0035.m6149(sbM6149, C0054.m8600(this));
        C0018.m3933(sbM61492, strM1189);
        return C0047.m7763(sbM61492);
    }
}