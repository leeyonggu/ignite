/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.processors.cache;

import org.apache.ignite.IgniteCache;
import org.apache.ignite.cache.CacheEntry;
import org.apache.ignite.cache.CacheEntryProcessor;
import org.apache.ignite.cache.CacheMetrics;
import org.apache.ignite.cache.CachePeekMode;
import org.apache.ignite.cache.query.*;
import org.apache.ignite.cluster.ClusterGroup;
import org.apache.ignite.lang.IgniteBiPredicate;
import org.apache.ignite.lang.IgniteClosure;
import org.apache.ignite.lang.IgniteFuture;
import org.apache.ignite.mxbean.CacheMetricsMXBean;
import org.apache.ignite.transactions.TransactionException;
import org.jetbrains.annotations.Nullable;

import javax.cache.Cache;
import javax.cache.CacheException;
import javax.cache.CacheManager;
import javax.cache.configuration.CacheEntryListenerConfiguration;
import javax.cache.configuration.Configuration;
import javax.cache.expiry.ExpiryPolicy;
import javax.cache.integration.CompletionListener;
import javax.cache.processor.EntryProcessor;
import javax.cache.processor.EntryProcessorResult;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.function.Consumer;

/**
 * Cache proxy stub.
 */
public class IgniteCacheProxyStub<K, V> implements IgniteCacheProxy<K, V>{
    /** */
    private static final long serialVersionUID = 0L;

    /**
     * Empty constructor.
     */
    public IgniteCacheProxyStub() {
        // No-op.
    }

    @Override
    public GridCacheContext<K, V> context() {
        return null;
    }

    @Override
    public IgniteCacheProxy<K, V> cacheNoGate() {
        return null;
    }

    @Override
    public boolean isAsync() {
        return false;
    }

    @Override
    public <K1, V1> IgniteCache<K1, V1> keepBinary() {
        return null;
    }

    @Override
    public IgniteCache<K, V> withDataCenterId(byte dataCenterId) {
        return null;
    }

    @Override
    public IgniteCache<K, V> skipStore() {
        return null;
    }

    @Override
    public GridCacheProxyImpl<K, V> internalProxy() {
        return null;
    }

    @Override
    public boolean isProxyClosed() {
        return false;
    }

    @Override
    public void closeProxy() {

    }

    @Override
    public IgniteFuture<?> destroyAsync() {
        return null;
    }

    @Override
    public IgniteFuture<?> closeAsync() {
        return null;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }

    @Override
    public <R> IgniteFuture<R> future() {
        return null;
    }

    @Override
    public IgniteCache<K, V> withAsync() {
        return null;
    }

    @Override
    public <C extends Configuration<K, V>> C getConfiguration(Class<C> clazz) {
        return null;
    }

    @Override
    public IgniteCache<K, V> withExpiryPolicy(ExpiryPolicy plc) {
        return null;
    }

    @Override
    public IgniteCache<K, V> withSkipStore() {
        return null;
    }

    @Override
    public IgniteCache<K, V> withNoRetries() {
        return null;
    }

    @Override
    public IgniteCache<K, V> withPartitionRecover() {
        return null;
    }

    @Override
    public <K1, V1> IgniteCache<K1, V1> withKeepBinary() {
        return null;
    }

    @Override
    public void loadCache(@Nullable IgniteBiPredicate<K, V> p, @Nullable Object... args) throws CacheException {

    }

    @Override
    public IgniteFuture<Void> loadCacheAsync(@Nullable IgniteBiPredicate<K, V> p, @Nullable Object... args) throws CacheException {
        return null;
    }

    @Override
    public void localLoadCache(@Nullable IgniteBiPredicate<K, V> p, @Nullable Object... args) throws CacheException {

    }

    @Override
    public IgniteFuture<Void> localLoadCacheAsync(@Nullable IgniteBiPredicate<K, V> p, @Nullable Object... args) throws CacheException {
        return null;
    }

    @Override
    public V getAndPutIfAbsent(K key, V val) throws CacheException, TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<V> getAndPutIfAbsentAsync(K key, V val) throws CacheException, TransactionException {
        return null;
    }

    @Override
    public Lock lock(K key) {
        return null;
    }

    @Override
    public Lock lockAll(Collection<? extends K> keys) {
        return null;
    }

    @Override
    public boolean isLocalLocked(K key, boolean byCurrThread) {
        return false;
    }

    @Override
    public <R> QueryCursor<R> query(Query<R> qry) {
        return null;
    }

    @Override
    public FieldsQueryCursor<List<?>> query(SqlFieldsQuery qry) {
        return null;
    }

    @Override
    public <T, R> QueryCursor<R> query(Query<T> qry, IgniteClosure<T, R> transformer) {
        return null;
    }

    @Override
    public Iterable<Entry<K, V>> localEntries(CachePeekMode... peekModes) throws CacheException {
        return null;
    }

    @Override
    public QueryMetrics queryMetrics() {
        return null;
    }

    @Override
    public void resetQueryMetrics() {

    }

    @Override
    public Collection<? extends QueryDetailMetrics> queryDetailMetrics() {
        return null;
    }

    @Override
    public void resetQueryDetailMetrics() {

    }

    @Override
    public void localEvict(Collection<? extends K> keys) {

    }

    @Override
    public V localPeek(K key, CachePeekMode... peekModes) {
        return null;
    }

    @Override
    public int size(CachePeekMode... peekModes) throws CacheException {
        return 0;
    }

    @Override
    public IgniteFuture<Integer> sizeAsync(CachePeekMode... peekModes) throws CacheException {
        return null;
    }

    @Override
    public long sizeLong(CachePeekMode... peekModes) throws CacheException {
        return 0;
    }

    @Override
    public IgniteFuture<Long> sizeLongAsync(CachePeekMode... peekModes) throws CacheException {
        return null;
    }

    @Override
    public long sizeLong(int partition, CachePeekMode... peekModes) throws CacheException {
        return 0;
    }

    @Override
    public IgniteFuture<Long> sizeLongAsync(int partition, CachePeekMode... peekModes) throws CacheException {
        return null;
    }

    @Override
    public int localSize(CachePeekMode... peekModes) {
        return 0;
    }

    @Override
    public long localSizeLong(CachePeekMode... peekModes) {
        return 0;
    }

    @Override
    public long localSizeLong(int partition, CachePeekMode... peekModes) {
        return 0;
    }

    @Override
    public <T> Map<K, EntryProcessorResult<T>> invokeAll(Map<? extends K, ? extends EntryProcessor<K, V, T>> map, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public <T> IgniteFuture<Map<K, EntryProcessorResult<T>>> invokeAllAsync(Map<? extends K, ? extends EntryProcessor<K, V, T>> map, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public V get(K key) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<V> getAsync(K key) {
        return null;
    }

    @Override
    public CacheEntry<K, V> getEntry(K key) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<CacheEntry<K, V>> getEntryAsync(K key) throws TransactionException {
        return null;
    }

    @Override
    public Map<K, V> getAll(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<Map<K, V>> getAllAsync(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public Collection<CacheEntry<K, V>> getEntries(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<Collection<CacheEntry<K, V>>> getEntriesAsync(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public Map<K, V> getAllOutTx(Set<? extends K> keys) {
        return null;
    }

    @Override
    public IgniteFuture<Map<K, V>> getAllOutTxAsync(Set<? extends K> keys) {
        return null;
    }

    @Override
    public boolean containsKey(K key) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> containsKeyAsync(K key) throws TransactionException {
        return null;
    }

    @Override
    public boolean containsKeys(Set<? extends K> keys) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> containsKeysAsync(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public void put(K key, V val) throws TransactionException {

    }

    @Override
    public IgniteFuture<Void> putAsync(K key, V val) throws TransactionException {
        return null;
    }

    @Override
    public V getAndPut(K key, V val) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<V> getAndPutAsync(K key, V val) throws TransactionException {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) throws TransactionException {

    }

    @Override
    public IgniteFuture<Void> putAllAsync(Map<? extends K, ? extends V> map) throws TransactionException {
        return null;
    }

    @Override
    public boolean putIfAbsent(K key, V val) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> putIfAbsentAsync(K key, V val) {
        return null;
    }

    @Override
    public boolean remove(K key) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> removeAsync(K key) throws TransactionException {
        return null;
    }

    @Override
    public boolean remove(K key, V oldVal) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> removeAsync(K key, V oldVal) throws TransactionException {
        return null;
    }

    @Override
    public V getAndRemove(K key) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<V> getAndRemoveAsync(K key) throws TransactionException {
        return null;
    }

    @Override
    public boolean replace(K key, V oldVal, V newVal) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> replaceAsync(K key, V oldVal, V newVal) throws TransactionException {
        return null;
    }

    @Override
    public boolean replace(K key, V val) throws TransactionException {
        return false;
    }

    @Override
    public IgniteFuture<Boolean> replaceAsync(K key, V val) throws TransactionException {
        return null;
    }

    @Override
    public V getAndReplace(K key, V val) throws TransactionException {
        return null;
    }

    @Override
    public IgniteFuture<V> getAndReplaceAsync(K key, V val) {
        return null;
    }

    @Override
    public void removeAll(Set<? extends K> keys) throws TransactionException {

    }

    @Override
    public IgniteFuture<Void> removeAllAsync(Set<? extends K> keys) throws TransactionException {
        return null;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public IgniteFuture<Void> removeAllAsync() {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public IgniteFuture<Void> clearAsync() {
        return null;
    }

    @Override
    public void clear(K key) {

    }

    @Override
    public IgniteFuture<Void> clearAsync(K key) {
        return null;
    }

    @Override
    public void clearAll(Set<? extends K> keys) {

    }

    @Override
    public IgniteFuture<Void> clearAllAsync(Set<? extends K> keys) {
        return null;
    }

    @Override
    public void localClear(K key) {

    }

    @Override
    public void localClearAll(Set<? extends K> keys) {

    }

    @Override
    public <T> T invoke(K key, EntryProcessor<K, V, T> entryProcessor, Object... arguments) throws TransactionException {
        return null;
    }

    @Override
    public <T> IgniteFuture<T> invokeAsync(K key, EntryProcessor<K, V, T> entryProcessor, Object... arguments) throws TransactionException {
        return null;
    }

    @Override
    public <T> T invoke(K key, CacheEntryProcessor<K, V, T> entryProcessor, Object... arguments) throws TransactionException {
        return null;
    }

    @Override
    public <T> IgniteFuture<T> invokeAsync(K key, CacheEntryProcessor<K, V, T> entryProcessor, Object... arguments) throws TransactionException {
        return null;
    }

    @Override
    public <T> Map<K, EntryProcessorResult<T>> invokeAll(Set<? extends K> keys, EntryProcessor<K, V, T> entryProcessor, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public <T> IgniteFuture<Map<K, EntryProcessorResult<T>>> invokeAllAsync(Set<? extends K> keys, EntryProcessor<K, V, T> entryProcessor, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public <T> Map<K, EntryProcessorResult<T>> invokeAll(Set<? extends K> keys, CacheEntryProcessor<K, V, T> entryProcessor, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public <T> IgniteFuture<Map<K, EntryProcessorResult<T>>> invokeAllAsync(Set<? extends K> keys, CacheEntryProcessor<K, V, T> entryProcessor, Object... args) throws TransactionException {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public IgniteFuture<?> rebalance() {
        return null;
    }

    @Override
    public IgniteFuture<?> indexReadyFuture() {
        return null;
    }

    @Override
    public CacheMetrics metrics() {
        return null;
    }

    @Override
    public CacheMetrics metrics(ClusterGroup grp) {
        return null;
    }

    @Override
    public CacheMetrics localMetrics() {
        return null;
    }

    @Override
    public CacheMetricsMXBean mxBean() {
        return null;
    }

    @Override
    public CacheMetricsMXBean localMxBean() {
        return null;
    }

    @Override
    public Collection<Integer> lostPartitions() {
        return null;
    }

    @Override
    public void loadAll(Set<? extends K> set, boolean b, CompletionListener completionListener) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public CacheManager getCacheManager() {
        return null;
    }

    @Override
    public boolean isClosed() {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> aClass) {
        return null;
    }

    @Override
    public void registerCacheEntryListener(CacheEntryListenerConfiguration<K, V> cacheEntryListenerConfiguration) {

    }

    @Override
    public void deregisterCacheEntryListener(CacheEntryListenerConfiguration<K, V> cacheEntryListenerConfiguration) {

    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Entry<K, V>> action) {

    }

    @Override
    public Spliterator<Entry<K, V>> spliterator() {
        return null;
    }
}