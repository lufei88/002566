package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class x implements t {
    public final Locale a;
    public final int b;
    public final String c;
    public final String d;

    public x(TimeZone timeZone, Locale locale, int i) {
        this.a = C0060.m9324(locale);
        this.b = i;
        this.c = C0029.m5247(timeZone, false, i, locale);
        this.d = C0029.m5247(timeZone, true, i, locale);
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        TimeZone timeZoneM3298 = C0014.m3298(calendar);
        int iM4943 = C0026.m4943(calendar, 16);
        Locale localeM6028 = C0034.m6028(this);
        C0034.m6027(sb, C0029.m5247(timeZoneM3298, iM4943 != 0, C0017.m3719(this), localeM6028));
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        return C0008.m1965(C0004.m1584(C0013.m3129(this)), C0004.m1584(C0012.m3003(this)));
    }
}