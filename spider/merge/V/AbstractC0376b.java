package com.github.catvod.spider.merge.v;

import androidx.core.util.Predicate;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i.C0344d;
import com.github.catvod.spider.merge.i.C0345e;
import com.github.catvod.spider.merge.x0.C0063;

/* renamed from: com.github.catvod.spider.merge.v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0376b {
    public static Predicate a(Predicate predicate, Predicate predicate2) {
        C0047.m7777(predicate2);
        return new C0375a(predicate, predicate2, 1);
    }

    public static Predicate b(Predicate predicate) {
        return new C0344d(3, predicate);
    }

    public static Predicate c(Predicate predicate, Predicate predicate2) {
        C0047.m7777(predicate2);
        return new C0375a(predicate, predicate2, 0);
    }

    public static /* synthetic */ boolean d(Predicate predicate, Predicate predicate2, Object obj) {
        return C0063.m9505(predicate, obj) && C0063.m9505(predicate2, obj);
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !C0063.m9505(predicate, obj);
    }

    public static /* synthetic */ boolean f(Predicate predicate, Predicate predicate2, Object obj) {
        return C0063.m9505(predicate, obj) || C0063.m9505(predicate2, obj);
    }

    public static Predicate g(Object obj) {
        return obj == null ? new C0345e(11) : new C0344d(2, obj);
    }

    public static /* synthetic */ boolean h(Object obj) {
        return obj == null;
    }

    public static Predicate j(Predicate predicate) {
        C0047.m7777(predicate);
        return m9369(predicate);
    }

    /* renamed from: ۟۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Predicate m9369(Object obj) {
        if (C0037.m6350() < 0) {
            return ((Predicate) obj).negate();
        }
        return null;
    }
}