package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public final class E implements InterfaceC0167y {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f411short = {745, 747, 736, 737, 684, 673, 736, 685};
    public final int a;

    public E(int i) {
        this.a = i;
    }

    /* renamed from: ۣ۟۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3847() {
        if (C0022.m4497() >= 0) {
            return f411short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        kVar.o = C0011.m2812(this);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof E) {
            return C0011.m2812(this) == C0011.m2812((E) obj);
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(0, 2), C0011.m2812(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0008.m1970(m3847(), 0, 8, 644), new Object[]{C0011.m2808(C0011.m2812(this))});
    }
}