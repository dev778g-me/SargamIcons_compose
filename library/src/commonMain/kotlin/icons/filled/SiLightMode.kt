package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiLightMode: ImageVector
    get() {
        if (_SiLightMode != null) {
            return _SiLightMode!!
        }
        _SiLightMode = ImageVector.Builder(
            name = "Filled.SiLightMode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group(
                clipPathData = PathData {
                    moveTo(0f, 0f)
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    close()
                }
            ) {
                path(fill = SolidColor(Color.Black)) {
                    moveTo(12f, 0f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                    verticalLineToRelative(4f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                    verticalLineTo(1f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                    moveTo(4.929f, 3.515f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.414f)
                    lineToRelative(2.828f, 2.828f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.414f, -1.414f)
                    close()
                    moveTo(1f, 11f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 2f)
                    horizontalLineToRelative(4f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -2f)
                    close()
                    moveTo(18f, 12f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                    horizontalLineToRelative(4f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                    horizontalLineToRelative(-4f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                    moveTo(17.657f, 16.243f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 1.414f)
                    lineToRelative(2.828f, 2.828f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, -1.414f)
                    close()
                    moveTo(7.757f, 17.657f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.414f, -1.414f)
                    lineTo(3.515f, 19.07f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                    close()
                    moveTo(20.485f, 4.929f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, -1.414f)
                    lineToRelative(-2.828f, 2.828f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.414f, 1.414f)
                    close()
                    moveTo(13f, 19f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    verticalLineToRelative(4f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 0f)
                    close()
                    moveTo(12f, 16f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -8f)
                    arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                }
            }
        }.build()

        return _SiLightMode!!
    }

@Suppress("ObjectPropertyName")
private var _SiLightMode: ImageVector? = null
