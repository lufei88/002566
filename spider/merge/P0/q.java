package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class q implements t {
    public final int a;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f487short = {2980};
    public static final q b = new q(3);
    public static final q c = new q(5);
    public static final q d = new q(6);

    public q(int i) {
        this.a = i;
    }

    /* renamed from: ۟ۧۦۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4643() {
        if (C0051.m8216() < 0) {
            return f487short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final void a(StringBuilder sb, Calendar calendar) {
        int iM4943 = C0026.m4943(calendar, 16) + C0026.m4943(calendar, 15);
        if (iM4943 == 0) {
            C0034.m6027(sb, C0011.m2805(m4643(), 0, 1, 3070));
            return;
        }
        if (iM4943 < 0) {
            C0057.m8950(sb, '-');
            iM4943 = -iM4943;
        } else {
            C0057.m8950(sb, '+');
        }
        int i = iM4943 / 3600000;
        C0044.m7472(sb, i);
        int iM6683 = C0040.m6683(this);
        if (iM6683 < 5) {
            return;
        }
        if (iM6683 == 6) {
            C0057.m8950(sb, ':');
        }
        C0044.m7472(sb, (iM4943 / 60000) - (i * 60));
    }

    @Override // com.github.catvod.spider.merge.P0.t
    public final int c() {
        return C0040.m6683(this);
    }
}