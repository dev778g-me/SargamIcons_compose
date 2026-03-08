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

val Sargam.Filled.SiHomeDetailed: ImageVector
    get() {
        if (_SiHomeDetailed != null) {
            return _SiHomeDetailed!!
        }
        _SiHomeDetailed = ImageVector.Builder(
            name = "Filled.SiHomeDetailed",
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
                path(
                    fill = SolidColor(Color.Black),
                    pathFillType = PathFillType.EvenOdd
                ) {
                    moveTo(21f, 19.588f)
                    verticalLineTo(8.884f)
                    lineToRelative(1.451f, 0.952f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.098f, -1.672f)
                    lineTo(19f, 5.179f)
                    verticalLineTo(3f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 0f)
                    verticalLineToRelative(0.866f)
                    lineToRelative(-3.73f, -2.448f)
                    arcToRelative(2.2f, 2.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.58f, 0f)
                    lineTo(0.45f, 8.165f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.1f, 1.67f)
                    lineTo(3f, 8.88f)
                    verticalLineToRelative(10.708f)
                    arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.4f, 22f)
                    horizontalLineToRelative(13.2f)
                    arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.412f)
                    moveTo(8f, 8f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                    horizontalLineToRelative(6f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                    horizontalLineTo(9f)
                    arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                    moveToRelative(2f, 5f)
                    verticalLineToRelative(8f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-8.2f)
                    curveToRelative(0f, -0.992f, 0.808f, -1.8f, 1.8f, -1.8f)
                    horizontalLineToRelative(4.4f)
                    curveToRelative(0.992f, 0f, 1.8f, 0.808f, 1.8f, 1.8f)
                    verticalLineTo(21f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-8f)
                    close()
                }
            }
        }.build()

        return _SiHomeDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiHomeDetailed: ImageVector? = null
