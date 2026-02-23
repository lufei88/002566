package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.p.C0057;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class z implements r {
    public static final z b = new z(0);
    public static final z c = new z(1);
    public static final z d = new z(2);
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i) {
        this.a = i;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (C0045.m7570(this)) {
            case 0:
                C0044.m7472(sb, C0026.m4943(calendar, 2) + 1);
                break;
            case 1:
                C0029.m5252(this, sb, C0026.m4943(calendar, 1) % 100);
                break;
            default:
                C0029.m5252(this, sb, C0026.m4943(calendar, 2) + 1);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.P0.r
    public final void b(StringBuilder sb, int i) {
        switch (C0045.m7570(this)) {
            case 0:
                C0044.m7472(sb, i);
                break;
            case 1:
                C0044.m7472(sb, i % 100);
                break;
            default:
                if (i >= 10) {
                    C0044.m7472(sb, i);
                    break;
                } else {
                    C0057.m8950(sb, (char) (i + 48));
                    break;
                }
        }
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        switch (C0045.m7570(this)) {
        }
        return 2;
    }
}