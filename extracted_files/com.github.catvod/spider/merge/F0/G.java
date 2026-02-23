package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public final class G implements InterfaceC0167y {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f413short = {2266, 2271, 2265, 2242, 2279, 2245, 2254, 2255, 2178, 2191, 2254, 2179};
    public final int a;

    public G(int i) {
        this.a = i;
    }

    /* renamed from: ۟ۦۣۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3849() {
        if (C0034.m6048() < 0) {
            return f413short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        C0050.m8083(C0032.m5691(kVar), C0019.m4064(kVar));
        kVar.o = C0026.m4978(this);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            return C0026.m4978(this) == C0026.m4978((G) obj);
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(0, 5), C0026.m4978(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0058.m9106(m3849(), 0, 12, 2218), new Object[]{C0011.m2808(C0026.m4978(this))});
    }
}