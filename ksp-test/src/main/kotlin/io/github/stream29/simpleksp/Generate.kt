@file:GenerateCode(
    packageName = "io.github.stream29.simpleksp",
    fileName = "Generated",
    template =
$$"""
package io.github.stream29.simpleksp
@for(i in 0..10)
val num${i} = ${i}@endfor
"""
)

package io.github.stream29.simpleksp