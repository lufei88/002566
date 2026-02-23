package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class s implements r {
    public final int a;
    public final int b;

    public s(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        C0058.m9112(this, sb, C0026.m4943(calendar, C0041.m6830(this)));
    }

    @Override // com.github.catvod.spider.merge.P0.r
    public final void b(StringBuilder sb, int i) {
        C0004.m1579(sb, i, C0042.m7149(this));
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        return C0042.m7149(this);
    }
}