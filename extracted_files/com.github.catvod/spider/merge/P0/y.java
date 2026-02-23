package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class y implements t {
    public static final y b = new y(true);
    public static final y c = new y(false);
    public final boolean a;

    public y(boolean z) {
        this.a = z;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        int iM4943 = C0026.m4943(calendar, 16) + C0026.m4943(calendar, 15);
        if (iM4943 < 0) {
            C0057.m8950(sb, '-');
            iM4943 = -iM4943;
        } else {
            C0057.m8950(sb, '+');
        }
        int i = iM4943 / 3600000;
        C0044.m7472(sb, i);
        if (C0009.m2108(this)) {
            C0057.m8950(sb, ':');
        }
        C0044.m7472(sb, (iM4943 / 60000) - (i * 60));
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        return 5;
    }
}