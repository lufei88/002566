package com.github.catvod.spider.merge.x0;

import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q0.f;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import java.util.NoSuchElementException;

/* renamed from: com.github.catvod.spider.merge.x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413c extends f {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public C0413c(int i, int i2, int i3) {
        int i4 = i;
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i4 >= i2 : i4 <= i2) {
            z = true;
        }
        this.c = z;
        this.d = z ? i4 : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C0004.m1493(this);
    }

    @Override // com.github.catvod.spider.merge.q0.f
    public final int nextInt() {
        int iM8452 = C0053.m8452(this);
        if (iM8452 != C0048.m7894(this)) {
            this.d = C0041.m6784(this) + iM8452;
        } else {
            if (!C0004.m1493(this)) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return iM8452;
    }
}