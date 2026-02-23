package com.github.catvod.spider.merge.i;

import android.content.ComponentName;
import android.content.UriMatcher;
import android.net.Uri;
import androidx.core.content.UriMatcherCompat;
import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0344d implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0344d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* renamed from: ۟۟ۢ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m8684(Object obj, Object obj2) {
        if (C0011.m2755() > 0) {
            return UriMatcherCompat.a((UriMatcher) obj, (Uri) obj2);
        }
        return false;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        C0062.m9413(this);
        return C0026.m4937(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        switch (C0062.m9413(this)) {
        }
        return C0009.m2117(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        C0062.m9413(this);
        return C0028.m5120(this, predicate);
    }

    public final boolean test(Object obj) {
        switch (C0062.m9413(this)) {
            case 0:
                return C0047.m7819((ComponentName) C0039.m6566(this), (ComponentName) obj);
            case 1:
                return m8684((UriMatcher) C0039.m6566(this), (Uri) obj);
            case 2:
                return C0017.m3640(C0039.m6566(this), obj);
            default:
                return C0014.m3291((Predicate) C0039.m6566(this), obj);
        }
    }
}