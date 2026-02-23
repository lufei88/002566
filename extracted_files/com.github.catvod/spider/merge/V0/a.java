package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Collection;

/* loaded from: classes.dex */
public final class a extends c {
    public a(Collection collection) {
        C0034.m6012(C0053.m8445(this), collection);
        this.b = C0009.m2139(C0053.m8445(this));
    }

    public a(n... nVarArr) {
        this(C0001.m1203(nVarArr));
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        for (int iM4768 = C0025.m4768(this) - 1; iM4768 >= 0; iM4768--) {
            if (!C0012.m3021((n) C0028.m5167(C0053.m8445(this), iM4768), mVar, mVar2)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return C0057.m8965(C0007.m1840(), C0053.m8445(this));
    }
}