package com.github.catvod.spider.merge.q0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements ListIterator {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f848short = {1791, 1728, 1749, 1730, 1745, 1732, 1753, 1759, 1758, 1680, 1753, 1731, 1680, 1758, 1759, 1732, 1680, 1731, 1733, 1728, 1728, 1759, 1730, 1732, 1749, 1748, 1680, 1750, 1759, 1730, 1680, 1730, 1749, 1745, 1748, 1693, 1759, 1758, 1756, 1737, 1680, 1747, 1759, 1756, 1756, 1749, 1747, 1732, 1753, 1759, 1758, 2683, 2628, 2641, 2630, 2645, 2624, 2653, 2651, 2650, 2580, 2653, 2631, 2580, 2650, 2651, 2624, 2580, 2631, 2625, 2628, 2628, 2651, 2630, 2624, 2641, 2640, 2580, 2642, 2651, 2630, 2580, 2630, 2641, 2645, 2640, 2585, 2651, 2650, 2648, 2637, 2580, 2647, 2651, 2648, 2648, 2641, 2647, 2624, 2653, 2651, 2650, 259, 316, 297, 318, 301, 312, 293, 291, 290, 364, 293, 319, 364, 290, 291, 312, 364, 319, 313, 316, 316, 291, 318, 312, 297, 296, 364, 298, 291, 318, 364, 318, 297, 301, 296, 353, 291, 290, 288, 309, 364, 303, 291, 288, 288, 297, 303, 312, 293, 291, 290};
    public static final b a = new b();

    /* renamed from: ۡ۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m9166() {
        if (C0032.m5686() < 0) {
            return f848short;
        }
        return null;
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException(C0031.m5565(m9166(), 0, 51, 1712));
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException(C0058.m9106(m9166(), 51, 51, 2612));
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException(C0055.m8814(m9166(), 102, 51, 332));
    }
}