package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiWalletAlt: ImageVector
    get() {
        if (_SiWalletAlt != null) {
            return _SiWalletAlt!!
        }
        _SiWalletAlt = ImageVector.Builder(
            name = "Filled.SiWalletAlt",
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
                    moveTo(17.6f, 4f)
                    horizontalLineTo(5f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                    horizontalLineToRelative(12.6f)
                    curveTo(21.132f, 2f, 24f, 4.868f, 24f, 8.4f)
                    verticalLineTo(17f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                    verticalLineTo(8.4f)
                    curveTo(22f, 5.972f, 20.028f, 4f, 17.6f, 4f)
                }
                path(
                    fill = SolidColor(Color.Black),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(17.6f, 6f)
                    horizontalLineTo(4.4f)
                    curveTo(3.075f, 6f, 2f, 7.164f, 2f, 8.6f)
                    verticalLineToRelative(9.8f)
                    curveTo(2f, 19.836f, 3.075f, 21f, 4.4f, 21f)
                    horizontalLineToRelative(13.2f)
                    curveToRelative(1.325f, 0f, 2.4f, -1.164f, 2.4f, -2.6f)
                    verticalLineTo(8.6f)
                    curveTo(20f, 7.164f, 18.925f, 6f, 17.6f, 6f)
                    moveToRelative(-0.6f, 7.5f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                    arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                }
            }
        }.build()

        return _SiWalletAlt!!
    }

@Suppress("ObjectPropertyName")
private var _SiWalletAlt: ImageVector? = null
