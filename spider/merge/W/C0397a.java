package com.github.catvod.spider.merge.w;

import android.content.ClipData;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* renamed from: com.github.catvod.spider.merge.w.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0397a implements Predicate {
    public final /* synthetic */ java.util.function.Predicate a;

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return C0026.m4937(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return C0009.m2117(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return C0028.m5120(this, predicate);
    }

    public final boolean test(Object obj) {
        return C0058.m9120(C0042.m7184(this), (ClipData.Item) obj);
    }
}