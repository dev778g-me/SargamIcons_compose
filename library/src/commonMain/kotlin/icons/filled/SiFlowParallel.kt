package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlowParallel: ImageVector
    get() {
        if (_SiFlowParallel != null) {
            return _SiFlowParallel!!
        }
        _SiFlowParallel = ImageVector.Builder(
            name = "Filled.SiFlowParallel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveTo(8f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(10f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(-8f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.825f)
                verticalLineToRelative(10.349f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                moveToRelative(10f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.825f)
                verticalLineToRelative(10.349f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _SiFlowParallel!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlowParallel: ImageVector? = null
