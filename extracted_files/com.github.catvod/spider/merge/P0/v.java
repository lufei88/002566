package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class v implements t {
    public final int a;
    public final String[] b;

    public v(String[] strArr, int i) {
        this.a = i;
        this.b = strArr;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        C0034.m6027(sb, C0010.m2286(this)[C0026.m4943(calendar, C0008.m1959(this))]);
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        String[] strArrM2286 = C0010.m2286(this);
        int length = strArrM2286.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int iM1584 = C0004.m1584(strArrM2286[length]);
            if (iM1584 > i) {
                i = iM1584;
            }
        }
    }
}