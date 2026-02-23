package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class D implements InterfaceC0167y {
    public final int a;
    public final InterfaceC0167y b;

    public D(int i, InterfaceC0167y interfaceC0167y) {
        this.a = i;
        this.b = interfaceC0167y;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        C0009.m2041(C0014.m3287(this), kVar);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return C0042.m7117(this) == C0042.m7117(d) && C0058.m9103(C0014.m3287(this), C0014.m3287(d));
    }

    public final int hashCode() {
        return C0043.m7334(C0031.m5632(C0059.m9238(0, C0042.m7117(this)), C0014.m3287(this)), 2);
    }
}