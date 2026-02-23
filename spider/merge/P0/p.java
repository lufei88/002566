package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class p implements r {
    public final /* synthetic */ int a;
    public final r b;

    public /* synthetic */ p(r rVar, int i) {
        this.a = i;
        this.b = rVar;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        switch (C0019.m4097(this)) {
            case 0:
                int iM4943 = C0026.m4943(calendar, 7);
                C0012.m3008(C0062.m9385(this), sb, iM4943 != 1 ? iM4943 - 1 : 7);
                break;
            case 1:
                int iM49432 = C0026.m4943(calendar, 10);
                if (iM49432 == 0) {
                    iM49432 = C0022.m4458(calendar, 10) + 1;
                }
                C0012.m3008(C0062.m9385(this), sb, iM49432);
                break;
            case 2:
                int iM49433 = C0026.m4943(calendar, 11);
                if (iM49433 == 0) {
                    iM49433 = C0025.m4824(calendar, 11) + 1;
                }
                C0012.m3008(C0062.m9385(this), sb, iM49433);
                break;
            default:
                C0012.m3008(C0062.m9385(this), sb, C0028.m5113(calendar));
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.P0.r
    public final void b(StringBuilder sb, int i) {
        switch (C0019.m4097(this)) {
            case 0:
                C0012.m3008(C0062.m9385(this), sb, i);
                break;
            case 1:
                C0012.m3008(C0062.m9385(this), sb, i);
                break;
            case 2:
                C0012.m3008(C0062.m9385(this), sb, i);
                break;
            default:
                C0012.m3008(C0062.m9385(this), sb, i);
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        switch (C0019.m4097(this)) {
        }
        return C0039.m6545(C0062.m9385(this));
    }
}