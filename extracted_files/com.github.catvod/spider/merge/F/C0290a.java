package com.github.catvod.spider.merge.f;

import com.github.catvod.spider.merge.o0.C0056;
import java.util.concurrent.CancellationException;

/* renamed from: com.github.catvod.spider.merge.f.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0290a {
    public static final C0290a b;
    public static final C0290a c;
    public final Throwable a;

    static {
        if (C0056.m8935()) {
            c = null;
            b = null;
        } else {
            c = new C0290a(false, null);
            b = new C0290a(true, null);
        }
    }

    public C0290a(boolean z, CancellationException cancellationException) {
        this.a = cancellationException;
    }
}