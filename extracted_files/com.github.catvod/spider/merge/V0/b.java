package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f632short = {1478, 1482};

    public b() {
    }

    public b(n... nVarArr) {
        List listM1203 = C0001.m1203(nVarArr);
        if (C0025.m4768(this) > 1) {
            C0004.m1532(C0053.m8445(this), new a(listM1203));
        } else {
            C0034.m6012(C0053.m8445(this), listM1203);
        }
        this.b = C0009.m2139(C0053.m8445(this));
    }

    /* renamed from: ۟ۡۦۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m5897() {
        if (C0043.m7332() >= 0) {
            return f632short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        for (int i = 0; i < C0025.m4768(this); i++) {
            if (C0012.m3021((n) C0028.m5167(C0053.m8445(this), i), mVar, mVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0057.m8965(C0050.m8131(m5897(), 0, 2, 1514), C0053.m8445(this));
    }
}