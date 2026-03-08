package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathData
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiDiamondsFour: ImageVector
    get() {
        if (_SiDiamondsFour != null) {
            return _SiDiamondsFour!!
        }
        _SiDiamondsFour = ImageVector.Builder(
            name = "Filled.SiDiamondsFour",
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
                    moveTo(13.839f, 1.11f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.677f, 0f)
                    lineToRelative(-1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.677f)
                    lineToRelative(1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.676f, 0f)
                    lineToRelative(1.98f, -1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.677f)
                    close()
                    moveTo(6.768f, 8.182f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.677f, 0f)
                    lineToRelative(-1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.676f)
                    lineToRelative(1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.677f, 0f)
                    lineToRelative(1.98f, -1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.676f)
                    close()
                    moveTo(13.839f, 15.253f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.677f, 0f)
                    lineToRelative(-1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.677f)
                    lineToRelative(1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.676f, 0f)
                    lineToRelative(1.98f, -1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.677f)
                    close()
                    moveTo(20.91f, 8.182f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.677f, 0f)
                    lineToRelative(-1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3.676f)
                    lineToRelative(1.98f, 1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.677f, 0f)
                    lineToRelative(1.98f, -1.98f)
                    arcToRelative(2.6f, 2.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.676f)
                    close()
                }
            }
        }.build()

        return _SiDiamondsFour!!
    }

@Suppress("ObjectPropertyName")
private var _SiDiamondsFour: ImageVector? = null
