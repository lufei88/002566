package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class A implements r {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ A(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (C0063.m9561(this)) {
            case 0:
                C0044.m7498(this, sb, C0026.m4943(calendar, C0036.m6253(this)));
                break;
            default:
                C0044.m7498(this, sb, C0026.m4943(calendar, C0036.m6253(this)));
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.P0.r
    public final void b(StringBuilder sb, int i) {
        switch (C0063.m9561(this)) {
            case 0:
                if (i >= 100) {
                    C0004.m1579(sb, i, 2);
                    break;
                } else {
                    C0044.m7472(sb, i);
                    break;
                }
            default:
                if (i >= 10) {
                    if (i >= 100) {
                        C0004.m1579(sb, i, 1);
                        break;
                    } else {
                        C0044.m7472(sb, i);
                        break;
                    }
                } else {
                    C0057.m8950(sb, (char) (i + 48));
                    break;
                }
        }
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        switch (C0063.m9561(this)) {
            case 0:
                return 2;
            default:
                return 4;
        }
    }
}