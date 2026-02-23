package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;

/* loaded from: classes.dex */
public final class H implements InterfaceC0167y {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f414short = {2602, 2599, 2606, 2619, 2678, 2683, 2618, 2679};
    public final int a;

    public H(int i) {
        this.a = i;
    }

    /* renamed from: ۟ۧۦ۟ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3850() {
        if (C0062.m9429() > 0) {
            return f414short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final void a(com.github.catvod.spider.merge.E0.k kVar) {
        kVar.m = C0058.m9104(this);
    }

    @Override // com.github.catvod.spider.merge.F0.InterfaceC0167y
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H) {
            return C0058.m9104(this) == C0058.m9104((H) obj);
        }
        return false;
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(0, 7), C0058.m9104(this)), 2);
    }

    public final String toString() {
        return C0002.m1327(C0031.m5565(m3850(), 0, 8, 2654), new Object[]{C0011.m2808(C0058.m9104(this))});
    }
}