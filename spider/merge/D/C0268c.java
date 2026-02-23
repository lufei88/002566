package com.github.catvod.spider.merge.d;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Map;

/* renamed from: com.github.catvod.spider.merge.d.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268c implements Map.Entry {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f762short = {1578, 1541, 1611, 1550, 1541, 1567, 1561, 1554, 1611, 1542, 1540, 1551, 1538, 1549, 1538, 1544, 1546, 1567, 1538, 1540, 1541, 1611, 1538, 1560, 1611, 1541, 1540, 1567, 1611, 1560, 1566, 1563, 1563, 1540, 1561, 1567, 1550, 1551, 1381};
    public final Object a;
    public final Object b;
    public C0268c c;
    public C0268c d;

    public C0268c(Object obj, androidx.lifecycle.a aVar) {
        this.a = obj;
        this.b = aVar;
    }

    /* renamed from: ۦۥۦۦ, reason: contains not printable characters */
    public static short[] m7741() {
        if (C0029.m5282() >= 0) {
            return f762short;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0268c)) {
            return false;
        }
        C0268c c0268c = (C0268c) obj;
        return C0058.m9103(C0050.m8116(this), C0050.m8116(c0268c)) && C0058.m9103(C0014.m3315(this), C0014.m3315(c0268c));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return C0050.m8116(this);
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return C0014.m3315(this);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return C0050.m8087(C0050.m8116(this)) ^ C0050.m8087(C0014.m3315(this));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException(C0050.m8131(m7741(), 0, 38, 1643));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0016.m3605(sb, C0050.m8116(this));
        C0018.m3933(sb, C0005.m1645(m7741(), 38, 1, 1368));
        C0016.m3605(sb, C0014.m3315(this));
        return C0047.m7763(sb);
    }
}