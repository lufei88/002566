package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class u implements t {
    public final String a;

    public u(String str) {
        this.a = str;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        C0034.m6027(sb, C0053.m8435(this));
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        return C0004.m1584(C0053.m8435(this));
    }
}