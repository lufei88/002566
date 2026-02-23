package com.github.catvod.spider.merge.v;

import androidx.core.content.IntentSanitizer;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.v.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0375a implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Predicate b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0375a(Predicate predicate, Predicate predicate2, int i) {
        this.a = i;
        this.b = predicate;
        this.c = predicate2;
    }

    public /* synthetic */ C0375a(Class cls, Predicate predicate) {
        this.a = 2;
        this.c = cls;
        this.b = predicate;
    }

    /* renamed from: ۠ۤۧۨ, reason: not valid java name and contains not printable characters */
    public static boolean m9368(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() <= 0) {
            return IntentSanitizer.Builder.e((Class) obj, (Predicate) obj2, obj3);
        }
        return false;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0030.m5341(this);
        return C0026.m4937(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0030.m5341(this)) {
        }
        return C0009.m2117(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0030.m5341(this);
        return C0028.m5120(this, predicate);
    }

    public final boolean test(Object obj) {
        switch (C0030.m5341(this)) {
            case 0:
                return C0022.m4466(C0048.m7892(this), (Predicate) C0012.m3041(this), obj);
            case 1:
                return C0015.m3463(C0048.m7892(this), (Predicate) C0012.m3041(this), obj);
            default:
                return m9368((Class) C0012.m3041(this), C0048.m7892(this), obj);
        }
    }
}