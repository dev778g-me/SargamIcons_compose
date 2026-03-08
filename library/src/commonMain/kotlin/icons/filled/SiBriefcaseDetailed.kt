package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiBriefcaseDetailed: ImageVector
    get() {
        if (_SiBriefcaseDetailed != null) {
            return _SiBriefcaseDetailed!!
        }
        _SiBriefcaseDetailed = ImageVector.Builder(
            name = "Filled.SiBriefcaseDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 4.8f)
                lineTo(8f, 7f)
                lineTo(4.4f, 7f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9.4f)
                verticalLineToRelative(9.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 21f)
                horizontalLineToRelative(15.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.4f, -2.4f)
                lineTo(22f, 9.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.6f, 7f)
                lineTo(16f, 7f)
                lineTo(16f, 4.8f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.2f, 3f)
                lineTo(9.8f, 3f)
                arcTo(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 4.8f)
                moveToRelative(2f, 0.2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                lineTo(14f, 5f)
                close()
                moveTo(10.8f, 11.5f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, 1.3f)
                verticalLineToRelative(0.2f)
                lineTo(3f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(0.2f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.3f, 1.3f)
                horizontalLineToRelative(2.4f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.3f, -1.3f)
                lineTo(14.5f, 15f)
                lineTo(21f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-0.2f)
                arcToRelative(1.3f, 1.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, -1.3f)
                close()
            }
        }.build()

        return _SiBriefcaseDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiBriefcaseDetailed: ImageVector? = null
