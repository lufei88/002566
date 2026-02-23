package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class w {
    public final TimeZone a;
    public final int b;
    public final Locale c;

    public w(TimeZone timeZone, boolean z, int i, Locale locale) {
        this.a = timeZone;
        if (z) {
            this.b = Integer.MIN_VALUE | i;
        } else {
            this.b = i;
        }
        this.c = C0060.m9324(locale);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return C0058.m9103(C0057.m9045(this), C0057.m9045(wVar)) && C0062.m9405(this) == C0062.m9405(wVar) && C0027.m5024(C0021.m4316(this), C0021.m4316(wVar));
    }

    public final int hashCode() {
        return C0050.m8087(C0057.m9045(this)) + ((C0005.m1640(C0021.m4316(this)) + (C0062.m9405(this) * 31)) * 31);
    }
}