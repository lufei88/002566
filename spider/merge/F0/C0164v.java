package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* renamed from: com.github.catvod.spider.merge.F0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0164v extends C0145b {
    public final C0168z f;
    public final boolean g;

    public C0164v(AbstractC0152i abstractC0152i, int i, Q q) {
        super(abstractC0152i, i, q, C0058.m9087());
        this.g = false;
        this.f = null;
    }

    public C0164v(C0164v c0164v, AbstractC0152i abstractC0152i) {
        super(c0164v, abstractC0152i, C0055.m8777(c0164v), C0048.m7921(c0164v));
        this.f = C0045.m7568(c0164v);
        this.g = C0034.m5983(c0164v, abstractC0152i);
    }

    public C0164v(C0164v c0164v, AbstractC0152i abstractC0152i, Q q) {
        super(c0164v, abstractC0152i, q, C0048.m7921(c0164v));
        this.f = C0045.m7568(c0164v);
        this.g = C0034.m5983(c0164v, abstractC0152i);
    }

    public C0164v(C0164v c0164v, AbstractC0152i abstractC0152i, C0168z c0168z) {
        super(c0164v, abstractC0152i, C0055.m8777(c0164v), C0048.m7921(c0164v));
        this.f = c0168z;
        this.g = C0034.m5983(c0164v, abstractC0152i);
    }

    public static boolean c(C0164v c0164v, AbstractC0152i abstractC0152i) {
        return C0039.m6477(c0164v) || ((abstractC0152i instanceof r) && C0055.m8809((r) abstractC0152i));
    }

    @Override // com.github.catvod.spider.merge.F0.C0145b
    public final boolean a(C0145b c0145b) {
        boolean zM9103 = true;
        if (this == c0145b) {
            return true;
        }
        if (!(c0145b instanceof C0164v)) {
            return false;
        }
        C0164v c0164v = (C0164v) c0145b;
        if (C0039.m6477(this) != C0039.m6477(c0164v)) {
            return false;
        }
        C0168z c0168zM7568 = C0045.m7568(this);
        C0168z c0168zM75682 = C0045.m7568(c0164v);
        if (c0168zM7568 != null) {
            zM9103 = C0058.m9103(c0168zM7568, c0168zM75682);
        } else if (c0168zM75682 != null) {
            zM9103 = false;
        }
        if (zM9103) {
            return super.a(c0145b);
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.F0.C0145b
    public final int hashCode() {
        return C0043.m7334(C0031.m5632(C0059.m9238(C0031.m5632(C0031.m5632(C0059.m9238(C0059.m9238(7, C0055.m8704(C0047.m7799(this))), C0012.m3044(this)), C0055.m8777(this)), C0048.m7921(this)), C0039.m6477(this) ? 1 : 0), C0045.m7568(this)), 6);
    }
}