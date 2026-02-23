package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.EmptyStackException;

/* loaded from: classes.dex */
public final class F implements InterfaceC0167y {
    public final /* synthetic */ int a;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f412short = {1625, 1601, 1603, 1626, 1731, 1756, 1731, 1790, 1756, 1751, 1750, 2251, 2249, 2260, 2243};
    public static final F b = new F(0);
    public static final F c = new F(1);
    public static final F d = new F(2);

    public /* synthetic */ F(int i) {
        this.a = i;
    }

    /* renamed from: ۣۧ۟ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3848() {
        if (C0015.m3433() >= 0) {
            return f412short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        switch (C0039.m6570(this)) {
            case 0:
                kVar.m = -2;
                return;
            case 1:
                com.github.catvod.spider.merge.H0.d dVarM5691 = C0032.m5691(kVar);
                int iM9566 = C0063.m9566(dVarM5691);
                if (iM9566 == 0) {
                    throw new EmptyStackException();
                }
                int i = iM9566 - 1;
                if (i < 0 || i >= iM9566) {
                    throw new IndexOutOfBoundsException();
                }
                int[] iArrM2085 = C0009.m2085(dVarM5691);
                int i2 = iArrM2085[i];
                C0062.m9384(iArrM2085, iM9566, iArrM2085, i, (iM9566 - i) - 1);
                int[] iArrM20852 = C0009.m2085(dVarM5691);
                int iM95662 = C0063.m9566(dVarM5691) - 1;
                iArrM20852[iM95662] = 0;
                dVarM5691.b = iM95662;
                kVar.o = i2;
                return;
            default:
                kVar.m = -3;
                return;
        }
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        switch (C0039.m6570(this)) {
        }
        return false;
    }

    public final boolean equals(Object obj) {
        switch (C0039.m6570(this)) {
            case 0:
                if (obj == this) {
                }
                break;
            case 1:
                if (obj == this) {
                }
                break;
            default:
                if (obj == this) {
                }
                break;
        }
        return false;
    }

    public final int hashCode() {
        switch (C0039.m6570(this)) {
            case 0:
                return C0043.m7334(C0059.m9238(0, 3), 1);
            case 1:
                return C0043.m7334(C0059.m9238(0, 4), 1);
            default:
                return C0043.m7334(C0059.m9238(0, 6), 1);
        }
    }

    public final String toString() {
        switch (C0039.m6570(this)) {
            case 0:
                return C0063.m9585(m3848(), 11, 4, 2214);
            case 1:
                return C0050.m8131(m3848(), 4, 7, 1715);
            default:
                return C0009.m2037(m3848(), 0, 4, 1578);
        }
    }
}