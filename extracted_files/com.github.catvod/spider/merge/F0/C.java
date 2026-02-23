package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.S.C0004;

/* loaded from: classes.dex */
public final class C implements InterfaceC0167y {
    public final int a;
    public final int b;

    public C(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        C0047.m7777(kVar);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c = (C) obj;
        return C0004.m1505(this) == C0004.m1505(c) && C0057.m8996(this) == C0057.m8996(c);
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(C0059.m9238(0, 1), C0004.m1505(this)), C0057.m8996(this)), 3);
    }
}