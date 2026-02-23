package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import okhttp3.Call;
import okhttp3.Response;

/* loaded from: classes.dex */
public abstract class c<T> {
    private T a = null;

    /* renamed from: ۟ۧۥ۟ۢ, reason: not valid java name and contains not printable characters */
    public static void m3193(Object obj, Object obj2, Object obj3) {
        if (C0048.m7971() >= 0) {
            ((c) obj).onFailure((Call) obj2, (Exception) obj3);
        }
    }

    /* renamed from: ۡۤۨۡ, reason: not valid java name and contains not printable characters */
    public static Object m3194(Object obj, Object obj2, Object obj3) {
        if (C0003.m1463() < 0) {
            return ((c) obj).onParseResponse((Call) obj2, (Response) obj3);
        }
        return null;
    }

    /* renamed from: ۥ۟ۧ۟, reason: contains not printable characters */
    public static Object m3195(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* renamed from: ۥۡ۠ۤ, reason: contains not printable characters */
    public static void m3196(Object obj, Object obj2) {
        if (C0027.m5017() > 0) {
            ((c) obj).onResponse(obj2);
        }
    }

    protected final void a(Call call, Response response) {
        T t = (T) m3194(this, call, response);
        this.a = t;
        m3196(this, t);
    }

    protected final void b() {
        this.a = (T) C0007.m1840();
    }

    public T getResult() {
        return (T) m3195(this);
    }

    protected void onError(Call call, Exception exc) {
        m3193(this, call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);
}