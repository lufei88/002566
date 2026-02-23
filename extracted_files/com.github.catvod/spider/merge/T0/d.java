package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import java.io.IOException;

/* loaded from: classes.dex */
public final class d extends t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f501short = {1426, 1490, 1493, 1488, 1477, 1488, 2233, 2212, 2270, 2246, 2241, 2244, 2257, 2244, 2270, 516, 516, 615};

    public d(String str) {
        super(str);
    }

    /* renamed from: ۠۟ۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m5315() {
        if (C0056.m8886() <= 0) {
            return f501short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.T0.t
    public final t A() {
        return (d) super.A();
    }

    @Override // com.github.catvod.spider.merge.T0.t, com.github.catvod.spider.merge.T0.r
    public final Object clone() {
        return (d) super.A();
    }

    @Override // com.github.catvod.spider.merge.T0.t, com.github.catvod.spider.merge.T0.r
    public final r g() {
        return (d) super.A();
    }

    @Override // com.github.catvod.spider.merge.T0.t, com.github.catvod.spider.merge.T0.r
    public final String o() {
        return C0001.m1189(m5315(), 0, 6, 1457);
    }

    @Override // com.github.catvod.spider.merge.T0.t, com.github.catvod.spider.merge.T0.r
    public final void q(Appendable appendable, int i, g gVar) {
        C0024.m4699(C0024.m4699(appendable, C0002.m1305(m5315(), 6, 9, 2181)), C0032.m5729(this));
    }

    @Override // com.github.catvod.spider.merge.T0.t, com.github.catvod.spider.merge.T0.r
    public final void r(Appendable appendable, int i, g gVar) {
        try {
            C0024.m4699(appendable, C0057.m8978(m5315(), 15, 3, 601));
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Q0.a(e);
        }
    }
}