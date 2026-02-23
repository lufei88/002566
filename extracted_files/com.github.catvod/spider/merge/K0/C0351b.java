package com.github.catvod.spider.merge.k0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.QuickJSObject;
import java.lang.reflect.Method;

/* renamed from: com.github.catvod.spider.merge.k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0351b implements JSCallFunction {
    public final /* synthetic */ Method a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0351b(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    /* renamed from: ۟ۦۦۧۤ, reason: not valid java name and contains not printable characters */
    public static Object m8840(Object obj, Object obj2, Object obj3) {
        if (C0053.m8389() > 0) {
            return QuickJSObject.a((Method) obj, obj2, (Object[]) obj3);
        }
        return null;
    }

    public final Object call(Object[] objArr) {
        return m8840(C0048.m7883(this), C0039.m6512(this), objArr);
    }
}