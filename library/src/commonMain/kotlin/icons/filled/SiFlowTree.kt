package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiFlowTree: ImageVector
    get() {
        if (_SiFlowTree != null) {
            return _SiFlowTree!!
        }
        _SiFlowTree = ImageVector.Builder(
            name = "Filled.SiFlowTree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveTo(13f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.825f)
                verticalLineTo(11f)
                horizontalLineToRelative(4.333f)
                curveTo(19.366f, 11f, 21f, 12.68f, 21f, 14.707f)
                verticalLineToRelative(2.467f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineToRelative(-2.467f)
                curveToRelative(0f, -0.95f, -0.767f, -1.707f, -1.667f, -1.707f)
                horizontalLineTo(13f)
                verticalLineToRelative(4.174f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineTo(13f)
                horizontalLineTo(6.667f)
                curveTo(5.767f, 13f, 5f, 13.757f, 5f, 14.707f)
                verticalLineToRelative(2.467f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -5.826f)
                verticalLineToRelative(-2.467f)
                curveTo(3f, 12.68f, 4.634f, 11f, 6.667f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(6.825f)
                arcTo(2.998f, 2.998f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
            }
        }.build()

        return _SiFlowTree!!
    }

@Suppress("ObjectPropertyName")
private var _SiFlowTree: ImageVector? = null
