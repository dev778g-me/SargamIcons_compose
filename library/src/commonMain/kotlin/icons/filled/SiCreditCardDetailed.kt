package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiCreditCardDetailed: ImageVector
    get() {
        if (_SiCreditCardDetailed != null) {
            return _SiCreditCardDetailed!!
        }
        _SiCreditCardDetailed = ImageVector.Builder(
            name = "Filled.SiCreditCardDetailed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.4f, 4f)
                horizontalLineToRelative(17.2f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 6.4f)
                verticalLineToRelative(11.2f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.4f, 2.4f)
                lineTo(3.4f, 20f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 17.6f)
                lineTo(1f, 6.4f)
                arcTo(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.4f, 4f)
                moveTo(22f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                close()
                moveTo(16f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            }
        }.build()

        return _SiCreditCardDetailed!!
    }

@Suppress("ObjectPropertyName")
private var _SiCreditCardDetailed: ImageVector? = null
