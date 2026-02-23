package com.github.catvod.spider.merge.G0;

import com.github.catvod.spider.merge.E.l;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.h0;
import com.github.catvod.spider.merge.F0.r;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f447short = {565, 532, 534, 515, 602, 522, 520, 543, 537, 543, 542, 543, 532, 537, 543, 602, 574, 572, 571, 521, 602, 535, 539, 515, 602, 537, 533, 532, 526, 539, 531, 532, 602, 539, 602, 522, 520, 543, 537, 543, 542, 543, 532, 537, 543, 602, 521, 526, 539, 520, 526, 602, 521, 526, 539, 526, 543, 596};
    public final HashMap a = new HashMap();
    public volatile d b;
    public final int c;
    public final r d;
    public final boolean e;

    public b(r rVar, int i) {
        this.d = rVar;
        this.c = i;
        boolean z = false;
        if ((rVar instanceof h0) && C0062.m9398((h0) rVar)) {
            d dVar = new d(new C0148e(true));
            dVar.c = new d[0];
            dVar.d = false;
            dVar.g = false;
            this.b = dVar;
            z = true;
        }
        this.e = z;
    }

    /* renamed from: ۣ۟ۡۥۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4131() {
        if (C0062.m9429() >= 0) {
            return f447short;
        }
        return null;
    }

    public final void a(int i, d dVar) {
        if (!C0044.m7381(this)) {
            throw new IllegalStateException(C0056.m8911(m4131(), 0, 58, 634));
        }
        if (i < 0) {
            return;
        }
        synchronized (C0049.m7987(this)) {
            try {
                if (i >= C0051.m8278(C0049.m7987(this)).length) {
                    C0049.m7987(this).c = (d[]) C0003.m1439(C0051.m8278(C0049.m7987(this)), i + 1);
                }
                C0051.m8278(C0049.m7987(this))[i] = dVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        return C0049.m7987(this) == null ? C0007.m1840() : C0033.m5806(new l(this, C0065.m9736()));
    }
}