package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.F0.C0163u;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.U0.C0176b;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class h extends m {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f505short = {2106, 2155, 2166, 2166, 2157, 2411, 2348, 2343, 2347, 2365, 2341, 2349, 2342, 2364};
    public g j;
    public C0163u k;
    public int l;

    public h(String str) {
        super(C0058.m9111(C0016.m3525(m5319(), 0, 5, 2073), C0019.m4093()), str, null);
        this.j = new g();
        this.l = 1;
        this.k = new C0163u(new C0176b());
    }

    /* renamed from: ۤۦ۟ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m5319() {
        if (C0044.m7508() < 0) {
            return f505short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.T0.m
    public final m B() {
        h hVar = (h) super.B();
        hVar.j = C0045.m7654(C0050.m8160(this));
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.T0.m, com.github.catvod.spider.merge.T0.r
    public final Object clone() {
        h hVar = (h) super.B();
        hVar.j = C0045.m7654(C0050.m8160(this));
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.T0.m, com.github.catvod.spider.merge.T0.r
    public final r g() {
        h hVar = (h) super.B();
        hVar.j = C0045.m7654(C0050.m8160(this));
        return hVar;
    }

    @Override // com.github.catvod.spider.merge.T0.m, com.github.catvod.spider.merge.T0.r
    public final String o() {
        return C0003.m1398(m5319(), 5, 9, 2376);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String p() {
        return C0000.m1081(this);
    }
}